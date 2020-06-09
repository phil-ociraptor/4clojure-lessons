; Write a function which drops every Nth item from a sequence.

; Favorite solution
#(reduce * (range 1 (inc %)))

; My first solution
#(apply * (range 1 (inc %)))

;; Commentary - In this case, reduce and apply are effectively the same, but
;; reduce is more close to factorial's definition of n! = n * (n - 1)!
