(ns app.ui.main
  (:require [keechma.next.helix.core :refer [with-keechma use-sub]]
            [keechma.next.helix.lib :refer [defnc]]
            [helix.core :as hx :refer [$]]
            [helix.dom :as d]
            [app.ui.pages.home :refer [Home]]
            [app.ui.pages.article :refer [Article]]
            ))


;; TASK move navbar here DRY
;; TASK add footer
;; TASK 404 PAGE
(defnc MainRenderer [props]
  (let [{:keys [page]} (use-sub props :router)]
    (case page
      "home" ($ Home)
      "article" ($ Article)
      (d/div "404"))))

(def Main (with-keechma MainRenderer))