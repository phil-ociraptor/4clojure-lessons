;; Write a function which takes a vector of keys and a vector of values and 
;; constructs a map from them.
;; Special Restrictions: zipmap

; My favorite solution
#(apply array-map (interleave %1 %2))

; My first solution
#(reduce merge (map hash-map %1 %2))
