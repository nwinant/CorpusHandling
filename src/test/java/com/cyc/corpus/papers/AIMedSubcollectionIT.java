/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cyc.corpus.papers;

/*
 * #%L
 * CorpusHandling
 * %%
 * Copyright (C) 2014 Cycorp, Inc
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.cyc.corpus.nlmpaper.AIMedOpenAccessPaper;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmoszko
 */
public class AIMedSubcollectionIT {
  
  public AIMedSubcollectionIT() {
  }
  
  @Test
  public void testSubCollectionRetrieval() {
    System.out.println("get");
    AIMedSubcollection result = new AIMedSubcollection("AIMedCorpus1", 20);
    assertEquals(20, result.getPapers().size());
  }
  
    @Test
  public void testSubcollectionCreation() {
    System.out.println("create");
    AIMedSubcollection result = new AIMedSubcollection("AIMedCorpus2", 20);
    assertEquals(20, result.getPapers().size());
  }
  
}
