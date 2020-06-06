; Write a function which removes consecutive duplicates from a sequence.

; Favorite solution
#(map first (partition-by identity %))

; My first solution
#(reduce (fn [a b]
           (if (= (last a) b)
             a
            (conj a b)))
         [] %)

; Struggles - learned about character literals i.e. \a
; Struggles - got confused between conj and cons

; Notes - partition (and group-by)
