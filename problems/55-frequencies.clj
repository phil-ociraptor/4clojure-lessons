;; Write a function which returns a map containing the number of occurences of 
;; each distinct item in a sequence.
;; Special Restrictions: frequencies

; My favorite solution
#(reduce (fn [m v] (assoc m v (+ 1 (get m v 0)))) {} %)

; Another smart solution
#(reduce-kv (fn [m k v] (assoc m k (count v))) {} (group-by identity %))
; Notice how reduce-kv plays nicely with anonymous functions
(fn [x] (reduce-kv #(assoc %1 %2 (count %3)) {} (group-by identity %)))

; My first solution
#(reduce (fn [acc x] (if (acc x) (assoc acc x (inc (acc x))) (assoc acc x 1))) {} %)

