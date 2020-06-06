; Write a function which duplicates each element of a sequence.

; Favorite solution
(fn [coll times] (mapcat #(repeat times %) coll))

; My first solution
#(mapcat (fn [x] (repeat %2 x)) %1) ; I prefer the #() function on the inside

