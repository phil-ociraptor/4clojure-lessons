; Write a function which duplicates each element of a sequence.

; Favorite solution
#(interleave % %)

; My first solution
mapcat (fn [x] [x x])

; Notes - interleave
