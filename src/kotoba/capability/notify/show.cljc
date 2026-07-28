(ns kotoba.capability.notify.show
  "Importable contract for notify/show.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:notify-show}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-notify-show", :capability/id "notify/show", :capability/effects #{:user-attention :external-communication}, :capability/provider-status :contract-only})
