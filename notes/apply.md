The docs: https://clojuredocs.org/clojure.core/apply

`(apply + [1 2 3 4 5])`

Take the fn and apply it against an arguments array. 

Note: Sometimes similar to reduce, but very different. See "When to use"

## Favorite example from docs:

```
(apply max [1 2 3])
;;=> 3

;; which is the same as 
(max 1 2 3)
;;=> 3
```

## When to use:

I've seen people use apply and reduce interchangeably and I think this is 
terrible.

The semantics of apply should be used when you are applying a function on an
arguments array.

When you are reducing, you are iteratively "folding" the collection down. Even
if the result is the same (the function is associative), you shouldn't use
apply when the meaning an iterative fold.

It's the difference between a cronut (lots of layers!) and a donut (no layers).
