The docs: https://clojuredocs.org/clojure.core/let

The official documentation makes absolutely no sense to me. Thank gof for the 
examples from the docs:

## Favorite example from docs:

```
;; let is a Clojure special form, a fundamental building block of the language.
;;
;; In addition to parameters passed to functions, let provides a way to create
;; lexical bindings of data structures to symbols. The binding, and therefore 
;; the ability to resolve the binding, is available only within the lexical 
;; context of the let. 
;; 
;; let uses pairs in a vector for each binding you'd like to make and the value 
;; of the let is the value of the last expression to be evaluated. let also 
;; allows for destructuring which is a way to bind symbols to only part of a 
;; collection.

;; A basic use for a let:
user=> (let [x 1] 
         x)
1
```

## When to use:

Use this all the time. It's how you create local variables. def will create
things on the global namespace.

