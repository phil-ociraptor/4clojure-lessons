; Write a function which drops every Nth item from a sequence.

; Favorite solution
#(flatten (partition-all (dec %2) %2 %1))

; My first solution
(fn [coll n] (mapcat
              #(if (= (count %) n) (drop-last %) %)
              (partition n n nil coll)))

; Notes - partition-all
