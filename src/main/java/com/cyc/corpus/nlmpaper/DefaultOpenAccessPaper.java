

package com.cyc.corpus.nlmpaper;

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

//// Internal Imports

//// External Imports
import java.util.logging.Level;
import java.util.logging.Logger;


public class DefaultOpenAccessPaper implements OpenAccessPaper {
  
  private final String paperID;

  //// Constructors

  /** Creates a new instance of DefaultOpenAccessPaper.
   * @param paperID the ID for the paper
   */
  public DefaultOpenAccessPaper(String paperID) {
    this.paperID = paperID;
  }

  //// Public Area

  //// Protected Area

  //// Private Area

  //// Internal Rep

  //// Main


  @Override
  public String getPaperID() {
    return paperID;
  }

  @Override
  public String getAbstract() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
