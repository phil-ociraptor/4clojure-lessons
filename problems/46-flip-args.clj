; Write a higher-order function which flips the order of the arguments
; of an input function.

; Favorite solution
(fn [f] #(apply f (reverse %&))) ; works on any number of args

; My first solution
(fn [f] #(f %2 %1))
