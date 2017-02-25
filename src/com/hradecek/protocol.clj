(ns com.hradecek.protocol)

(defprotocol Concatenatable
  (cat' [this other]))

(extend-type String
  Concatenatable
  (cat' [this other]
    (.concat this other)))

(extend-type java.util.List
  Concatenatable
  (cat' [this other]
    (concat this other)))

(defn -main []
  (println
    (cat' "House" " of Wolves"))
  (println
    (cat' [1 2 3] [4 5 6 7])))

