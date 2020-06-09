The docs: https://clojuredocs.org/clojure.core/juxt

`(juxt f g)`

means to create a new function that would take input `x` and return a vector:
`[(f x) (g x)]`

## Favorite example from docs:

```
;; Get the first character and length of string

((juxt first count) "Clojure Rocks")
;;=> [\C 13]
```

## What I like:

This is pretty rad. Never thought something like this would exist, but can see
it becoming extremely useful when using a vector as a tuple.

