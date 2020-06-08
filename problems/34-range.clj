; Write a function which creates a list of all integers in a given range.
; Special Restrictions: range

; Favorite solution
#(take (- %2 %1) (iterate inc %1))

; My first solution
#(take (- %2 %1) ((fn series [x] (lazy-seq (cons x (series (+ x 1))))) %1))
