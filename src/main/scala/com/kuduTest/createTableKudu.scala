package com.kuduTest

import org.apache.spark.sql.DataFrame
import org.apache.kudu.spark.kudu.KuduContext
import org.apache.kudu.client.CreateTableOptions

/**
 * Clase genérica para crear tablas en Kudu
 * @param kuduContext Contexto de Kudu para interactuar con el servidor
 */
class createTableKudu(kuduContext: KuduContext) {
  
  /**
   * Crea una tabla en Kudu a partir de un DataFrame
   * 
   * @param tableName Nombre de la tabla a crear
   * @param dataFrame DataFrame que contiene los datos y el schema
   * @param primaryKeys Lista de columnas que forman la clave primaria
   * @param numReplicas Número de replicas (por defecto 1)
   */
  def createTable(
    tableName: String,
    dataFrame: DataFrame,
    primaryKeys: List[String],
    numReplicas: Int = 1
  ): Unit = {
    try {
      val schema = dataFrame.schema
      
      val tableOptions = new CreateTableOptions()
        .setNumReplicas(numReplicas)
      
      // Crear la tabla si no existe
      if (!kuduContext.tableExists(tableName)) {
        kuduContext.createTable(tableName, schema, primaryKeys, tableOptions)
        println(s"✅ Tabla '$tableName' creada correctamente")
      } else {
        println(s"⚠️  La tabla '$tableName' ya existe")
      }
    } catch {
      case ex: Exception =>
        println(s"❌ Error al crear la tabla '$tableName': ${ex.getMessage}")
        throw ex
    }
  }
  
  /**
   * Verifica si una tabla existe en Kudu
   * 
   * @param tableName Nombre de la tabla a verificar
   * @return true si la tabla existe, false en caso contrario
   */
  def tableExists(tableName: String): Boolean = {
    kuduContext.tableExists(tableName)
  }
  
  /**
   * Elimina una tabla de Kudu
   * 
   * @param tableName Nombre de la tabla a eliminar
   */
  def dropTable(tableName: String): Unit = {
    try {
      if (kuduContext.tableExists(tableName)) {
        kuduContext.deleteTable(tableName)
        println(s"✅ Tabla '$tableName' eliminada correctamente")
      } else {
        println(s"⚠️  La tabla '$tableName' no existe")
      }
    } catch {
      case ex: Exception =>
        println(s"❌ Error al eliminar la tabla '$tableName': ${ex.getMessage}")
        throw ex
    }
  }
}
