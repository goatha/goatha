/** -*- coding: utf-8-unix; mode: scala -*-
 * @file   Worker.scala
 * @brief  
 * @author y_yoshida
 * @since  2009-12-16T17:43:45+09:00
 */
package com.goatha.model

import javax.persistence._
import com.google.appengine.api.datastore.Key


/**
 An author is someone who writes books.
*/
@Entity
class Worker {
  @Id
  @GeneratedValue(){val strategy = GenerationType.IDENTITY}
  var id : Key = _

  @Column{val nullable = false}
  var name : String = ""

  @OneToMany{val mappedBy = "author", val targetEntity=classOf[Shop]}
  var books : java.util.List[Shop] = _
}
