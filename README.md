# capability-notify-show

Atomic authority package for `notify/show`.

- imports: `#{:notify-show}`
- effects: `#{:user-attention :external-communication}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
