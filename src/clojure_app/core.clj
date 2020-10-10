(ns clojure-app.core
  (:gen-class))

(def data [{:name "Bruno" :age 22 :city "Zagreb" :gender "Male"}
             {:name "Marko" :age 26 :city "Osijek" :gender "Male"}
             {:name "Marta" :age 28 :city "Zadar" :gender "Female"}
             {:name "Matej" :age 21 :city "Rijeka" :gender "Male"}
             {:name "Ivana" :age 24 :city "Zagreb" :gender "Female"}
             {:name "Tin" :age 25 :city "Split" :gender "Male"}
             {:name "Karlo" :age 29 :city "Zagreb" :gender "Female"} 
             ])
    (println "All data: " data)
    (defn get-names []
      (let [names (mapv (fn [item] (:name item)) data)] names)
      )
      (println "Only names: " (get-names))
      ;;filters peoples age
      (defn filter-age []
        (let [filter-data (filterv (fn [item]
         (< (:age item) 25)) data)]
          filter-data
          )
        )
      ;;returns citys of people younger than 25
      (defn filter-city [data]
         (let [filter-data (mapv (fn [item]
          (println (:city item))) data)]  
      )
      )
    ;;returns number of males
    (defn filter-gender-counter []
      (let [filter-data (filterv (fn [item]
        (= (:gender item) "Male")) data)]
        (count filter-data) 
          )
        )

  
