# Websockets Example

First, get the backend running:

```
cd backend
lein run
```

Now, get the frontend running:

```
cd frontend
ruby -run -ehttpd . -p3000
```

Finally, [open the page on a web browser](http://localhost:3000).

Inspect the page to see:

- The websocket connection
- How the page has changed

