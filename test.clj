(require '[clojure.java.jdbc :as sql])

(sql/db-do-commands "postgresql://localhost:5432/shouter"
                                               (sql/create-table-ddl :testing [:data :text]))
