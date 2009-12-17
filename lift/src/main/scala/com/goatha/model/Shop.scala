/** -*- coding: utf-8-unix; mode: scala -*-
 * @file   Shop.scala
 * @brief  
 * @author y_yoshida
 * @since  2009-12-15T17:15:21+09:00
 */
package com.goatha.model

import com.google.appengine.api.datastore.Key

import java.util.Date
import javax.persistence._
// import org.hibernate.annotations.Type


@Entity
class Shop {
  @Id
  @GeneratedValue(){val strategy = GenerationType.IDENTITY}
  var id : Key = _

  @Column{val nullable = false}
  var title : String = ""

  @Column{val nullable = true}
  var published : Date = new Date()

  @Column{val nullable = true}
  var genre : String = "unknown" //Genre.unknown.toString

  @Column{val nullable = false}
  @ManyToOne
  var worker : Worker = _
}



// import _root_.java.util.Date;
// import _root_.javax.jdo.annotations.{IdGeneratorStrategy, IdentityType, PersistenceCapable, Persistent, PrimaryKey}
// import _root_.java.io.Serializable


// @PersistenceCapable{val identityType = IdentityType.APPLICATION}
// class Employee(name : String, message : String) extends Serializable {

//     @PrimaryKey
//     @Persistent{val valueStrategy = IdGeneratorStrategy.IDENTITY}
//     private var id_ : Long = 0

//     @Persistent
//     private var name_ : String = name

//     @Persistent{val serialized = "true"}
//     private var message_ : String = message

//     // Accessors for the fields.  JDO doesn't use these, but your application does.

//     def getId() : Long = return id_

//     def getName() : String = return name_
//     def setName(name : String) = name_ = name

//     def getMessage() : String = return message_
//     def setMessage(message : String) = message_ = message
// }


// import java.util.{Date, List}

// import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

// import com.google.appengine.api.datastore.DatastoreService
// import com.google.appengine.api.datastore.DatastoreServiceFactory
// import com.google.appengine.api.datastore.Entity
// import com.google.appengine.api.datastore.FetchOptions
// import com.google.appengine.api.datastore.PreparedQuery
// import com.google.appengine.api.datastore.Query
// import com.google.appengine.api.datastore.Transaction
// import com.google.appengine.api.urlfetch.HTTPRequest

// class Shop {

//   def load() {
//     var datastoreService : DatastoreService = DatastoreServiceFactory.getDatastoreService();

//     save(datastoreService);

//     // 検索
//     var q : Query = new Query("todo") // KIND：todoを検索
//     var pq : PreparedQuery = datastoreService.prepare(q)
//     val list : List[Entity] = pq.asList(FetchOptions.Builder.withOffset(0));
//     for (x <- list) {
//       println(x.getProperty("content") + " : " + x.getProperty("createdAt"))
//     }

//     // list.foreach(x => x.getProperty("content"))
//     // println(x.getProperty("content") + " : " + x.getProperty("createdAt"))
//   }

//   def save(datastoreService : DatastoreService) {
//   }
//   // private void save(HttpServletRequest req, DatastoreService datastoreService) {
//   //   // 保存
//   //   Entity todo = new Entity("todo");
//   //   todo.setProperty("content", req.getParameter("content"));
//   //   todo.setProperty("createdAt", new Date());

//   //   Transaction transaction = datastoreService.beginTransaction();
//   //   try {
//   //     datastoreService.put(todo);
//   //     transaction.commit();
//   //   } finally {
//   //     if (transaction.isActive()) {
//   //       transaction.rollback();
//   //     }
//   //   }
//   // }
// }
