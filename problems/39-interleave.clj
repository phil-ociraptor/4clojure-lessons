;; Write a function which takes two sequences and returns the first item from 
;; each, then the second item from each, then the third, etc.
;; Special Restrictions: interleave

; Favorite solution
#(mapcat vector %1 %2)

; My first solution
#(flatten (map vector %1 %2))

;; Note - map can take in multiple lists. This is mindblowing, and one of the
;; most amazing things about clojure - the ability to take in variadic 
;; parameters with ease

