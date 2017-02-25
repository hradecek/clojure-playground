(ns com.hradecek.protocol)

(defprotocol Concatenatable
  (cat' [this other]))

(extend-type String
  Concatenatable
  (cat' [this other]
    (.concat this other)))

(defn -main []
  (println
    (cat' "House" " of Wolves")))

