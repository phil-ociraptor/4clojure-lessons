;; Write a function which takes a variable number of parameters and 
;; returns the maximum value.
;; Special Restrictions: max, max-key

; Favorite solution
; My first solution
#(reduce (fn [a b] (if (> a b) a b)) %&)

; Other notable solution
#(last (sort %&))
