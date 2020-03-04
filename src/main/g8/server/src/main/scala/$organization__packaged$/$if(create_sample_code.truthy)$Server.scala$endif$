package $organization$

import cats.effect._
import $organization$.hello.Greeter
import higherkindness.mu.rpc.server._

object Server extends IOApp {

  implicit val greeter: Greeter[IO] = new HappyGreeter[IO]

  def run(args: List[String]): IO[ExitCode] = for {
    grpcConfig <- Greeter.bindService[IO]
    server     <- GrpcServer.default[IO](12345, List(AddService(grpcConfig)))
    _          <- GrpcServer.server[IO](server)
  } yield ExitCode.Success

}
