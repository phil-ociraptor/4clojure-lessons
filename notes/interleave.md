The docs: https://clojuredocs.org/clojure.core/interleave

`(interleave c1 c2)`

"zipper-merge" or "braids" the collections together into one connection

## Favorite example from docs:

```
(interleave [:a :b :c] [1 2 3])
;;=> (:a 1 :b 2 :c 3)
```

## What I like:

Simple way to "zipper-merge" multiple collections together

