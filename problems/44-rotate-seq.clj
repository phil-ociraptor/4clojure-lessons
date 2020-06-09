; Write a function which can rotate a sequence in either direction.

; Favorite solution
#(let [i (mod % (count %2))]
   (concat (drop i %2) (take i %2)))

; My first solution
#(let [size (count %2)
       pos (mod % size)]
       (concat (take-last (- size pos) %2) (take pos %2)))
