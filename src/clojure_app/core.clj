(ns clojure-app.core
  (:gen-class))

(defn -main []
  (def data [{:name "Bruno" :age 22 :city "Zagreb" :gender "Male"}
             {:name "Marko" :age 26 :city "Osijek" :gender "Male"}
             {:name "Marta" :age 28 :city "Zadar" :gender "Female"}
             {:name "Matej" :age 21 :city "Rijeka" :gender "Male"}
             {:name "Ivana" :age 24 :city "Zagreb" :gender "Female"} 
             ])
    (println "All data: " data)
    (defn get-names []
      (let [names (map (fn [item] (:name item)) data)] names)
      )
      (println "Only names: " (get-names))
      ;;not working
      (defn is-age? [age number] 
        (if(< num age) true false))

      (defn filterAge []
        (let [personAge (map (fn [item] (:age item)) data)] personAge)
          (if (is-age? item 25) "Return users name" "No people younger than 25")
        )
      (filterAge)
        )
  
