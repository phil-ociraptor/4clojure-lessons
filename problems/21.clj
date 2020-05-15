;; Write a function which returns the Nth element from a sequence.
;; Special Restrictions: nth

;; My favorite
#(first (drop %2 %1))

;; Other good solutions
#(->> %1 (drop %2) first)

;; My first solution :D
(fn seek [s i] (if (= 0 i) (first s) (seek (rest s) (- i 1)) ))

;; Notes: threading_macros 
