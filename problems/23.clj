;; Write a function which returns the total number of elements in a sequence.
;; (Without using count)

;; My favorite
into ()

;; Other good solutions
reduce conj ()
apply conj () ; a variation of the reduce version, less clear

;; Other solutions
#(loop [s % r (seq '())]
   (if (empty? s) r
     (recur (next s) (cons (first s) r))))


;; My first solution :D
(fn rev [s] (if (empty? s) [] (conj (rev (rest s)) (first s))))


;; Discussion: the solutions work to reverse a seq because of how Lists behave
;; when they're conj-ed. Remember, Vectors conj by putting something at the end
;; but Lists conj by putting something at the start. into works by calling conj
;; on each elem, which by nature of Lists, means older elems are added to the
;; front

;; Notes: into, apply
