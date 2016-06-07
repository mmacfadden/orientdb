package com.orientechnologies.orient.core.metadata.schema;

import com.orientechnologies.orient.core.db.document.ODatabaseDocument;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.sql.OCommandSQL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tglman on 05/01/16.
 */
public class OSchemaBlogClustersEmbeddedTest {

  private ODatabaseDocument db;

  @Before
  public void before() {
    db = new ODatabaseDocumentTx("memory:" + OSchemaBlogClustersEmbeddedTest.class.getSimpleName());
    db.create();
  }

  @After
  public void after() {
    db.drop();
  }

  @Test
  public void addBlobCluster() {
    int prevSize = db.getBlobClusterIds().size();
    db.addBlobCluster("test_blob");
    int newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize + 1, newSize);

  }

  @Test
  public void addRemoveBlobCluster() {
    int prevSize = db.getBlobClusterIds().size();
    db.addBlobCluster("test_blob");
    int newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize + 1, newSize);
    db.dropCluster("test_blob", true);
    newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize, newSize);
  }

  @Test
  public void addDbRemoveBlobCluster() {
    int prevSize = db.getBlobClusterIds().size();
    db.addBlobCluster("test_blob");
    int newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize + 1, newSize);
    db.dropCluster("test_blob", true);
    newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize, newSize);
  }

  @Test
  public void addDbRemoveBlobClusterById() {
    int prevSize = db.getBlobClusterIds().size();
    int id = db.addBlobCluster("test_blob");
    int newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize + 1, newSize);
    db.dropCluster(id, true);
    newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize, newSize);
  }

  @Test
  public void addRemoveMultipleBlobCluster() {
    int prevSize = db.getBlobClusterIds().size();
    db.addBlobCluster("test_blob");
    db.addBlobCluster("test_blob1");
    int newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize + 2, newSize);
    db.dropCluster("test_blob", true);
    db.dropCluster("test_blob1", true);
    newSize = db.getBlobClusterIds().size();
    assertEquals(prevSize, newSize);
  }

  @Test
  public void addBlobClusterSqlTest() {
    db.command(new OCommandSQL("create blob cluster example_blob")).execute();
    int cl = db.getClusterIdByName("example_blob");
    assertTrue(db.getBlobClusterIds().contains(cl));
  }

  @Test
  public void addBlobClusterRemoveSqlTest() {
    db.command(new OCommandSQL("create blob cluster example_blob_remove")).execute();
    assertEquals(1, db.getBlobClusterIds().size());
    db.command(new OCommandSQL("drop cluster example_blob_remove")).execute();
    assertEquals(0, db.getBlobClusterIds().size());
  }

}
