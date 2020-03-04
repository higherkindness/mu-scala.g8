A [Giter8][g8] template to create an example [Mu-Scala] gRPC server and client.

## Project layout

The template creates a project consisting of 3 modules:

* the `protocol` module, for generating source code from Avro/Protobuf IDL files
* the `server` module, for a gRPC server
* the `client` module, for a gRPC client

## How to use

Create a new project from this template using the `sbt new` command:

```
sbt new higherkindness/mu-scala.g8
```

### `create_sample_code`

If you set the `create_sample_code` parameter to `yes` (the default value), the
template will create three modules demonstrating how to build a gRPC server and
client with Mu:

* the `protocol` module will contain a "hello world" Avro/Protobuf IDL file
* the `client` module will contain a working implementation of a gRPC client
* the `server` module will contain a working implementation of a gRPC server, as
  well as a unit test

### `use_protobuf` and `use_avro`

You should set exactly one of these to `yes`, and the other to `no`.

Depending on these parameters, the example IDL file created in the `protocol`
module will be either a `.proto` or a `.avdl` file.

### Try it out

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
