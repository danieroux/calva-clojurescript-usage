# Getting started with Calva

1. Start a Clojure REPL: `make repl` (a VS Code integrated terminal works great for this.)
1. Wait for the message `nREPL server started on port ...
1. Connect the REPL via the "Connect to a Running REPL Server in the Project" command in VS Code.
   * Choose "My local build" as the connection type
   * Press enter at the next prompt which is prefilled with `localhost:<some-port>
1. Wait for the app to compile and open in your browser (opens on http://localhost:9010)
   * Close the alert displayed
1. Wait for the Calva output/repl window to display `; Connected session: cljs`
1. Load `src/main/repro/ui/core.cljs` (open it and use the command **Calva: Load file and dependencies**) 


... from here I want to open portal.cljs, eval the file and have Portal pop up.

It requires some fiddling with “Toggle the REPL connection” for both output.calva-repl and my portal.cljs. And I have not found a sequence that is reliable yet.