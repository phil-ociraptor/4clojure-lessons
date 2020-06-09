; Write a function which will split a sequence into two parts.

; Favorite solution
(juxt take drop)

; My first solution
#(list (take % %2) (drop % %2))

; Notes - juxt
