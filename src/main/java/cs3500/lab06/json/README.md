# JSON

This package holds all classes used for JSON serialization and deserialization.
Java records are used as intermediate data structures to convert from Strings 
in JSON form to usable data. [GuessJSON](GuessJSON.java), 
[GuessResponseJSON](GuessResponseJSON.java), [MessageJSON](MessageJSON.java),
and [WinJSON](WinJSON.java) are all records used as intermediate data types.
[JsonUtils](JsonUtils.java) is a utility class used for general methods that 
deal with JSON serialization/deserialization.

## File Structure

| File                                        | Description                                           |
|---------------------------------------------|-------------------------------------------------------|
| [GuessJSON](GuessJSON.java)                 | Simple record to hold a guess as described in Json    |
| [GuessResponseJSON](GuessResponseJSON.java) | Simple record to hold a guess response to the server  |
| [JsonUtils](JsonUtils.java)                 | Utility class for general methods that deal with Json |
| [MessageJSON](MessageJSON.java)             | Simple record to hold a message from the server       |
| [WinJSON](WinJSON.java)                     | Simple record to hold a win as described in Json      |