# Client

This package is in charge of connecting to the server and playing the game.
[Client](Client.java) establishes a connection with the server and then
instantiating a [ProxyReferee](ProxyReferee.java) to handle communication with
the server. The ProxyReferee also takes a [Player](Player.java) to use to answer
the server's requests. The [RandomPlayer](RandomPlayer.java) is a simple 
implementation of the Player interface used by this Client.

## File Structure

| File | Description                                   |
| --- |-----------------------------------------------|
| [Client](Client.java) | Connects the client to the server             |
| [Player](Player.java) | The Player interface                          |
| [ProxyReferee](ProxyReferee.java) | Handles Client-Server communication           |
| [RandomPlayer](RandomPlayer.java) | Simple implementation of the Player interface |