;; Write a function which returns the second to last element from a sequence.

;; My favorite
(comp second reverse)

;; Other good solutions
#(second (reverse %))
#(-> % reverse second)

;; Notes: comp, threading, anonymous_function_literal
