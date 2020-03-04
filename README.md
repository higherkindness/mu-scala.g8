A [Giter8][g8] template to create an example [Mu-Scala] gRPC server and client.

## How to use

Create a new project from this template using the `sbt new` command:

```
sbt new higherkindness/mu-scala.g8
```

If you set the `create_sample_code` parameter to `yes` (the default value), the
template will include three modules demonstrating how to build a gRPC server and
client with Mu:

* the `protocol` module generates source code from an Avro/Protobuf IDL file
* the `client` module contains a working mplementation of a gRPC client
* the `server` module contains a working mplementation of a gRPC server, as well
  as a unit test

To see everything working:

1. Start the server with `sbt server/run`
2. In another terminal window, run the client with `sbt client/run` and enter
   your name when prompted

You can also run the unit test with `sbt server/test`.

## Template license
Written in 2020 by Chris Birchall (chris.birchall@47deg.com)

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[Mu-Scala]: https://higherkindness.io/mu-scala/
