The docs: https://clojuredocs.org/clojure.core/lazy-seq

`(lazy-seq & body)`


Typically used in a recursive function to lazily generate the rest of a seq
```
(fn some-fn [a] (lazy-seq ( cons a (some-fn a))))
```

Ordinarily, this would never terminate, but this is lazy eval

## Favorite example from docs:

```
user=> (defn fib 
         ([]
           (fib 1 1))
         ([a b]
           (lazy-seq (cons a (fib b (+ a b))))))

user=> (take 5 (fib))
(1 1 2 3 5)
```

## When to use:

Perfect when generating an infinite series of some sort. (Which will be used to
do `take` or `nth` or something to pluck specific values from that series)

