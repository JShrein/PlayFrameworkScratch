package controllers;


import play.api.libs.ws.WS;
import play.api.libs.ws.WSResponse;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import scala.concurrent.Future;

/**
 * Created by Johns on 3/9/15.
 */
public class Proxy extends Controller {
    public static Result index(String url)
    {
        Promise<WSResponse> responsePromise = WS.url(url).get();
        Promise<Result> promiseOfResult

        return async(responsePromise.map(new F.Function<WSResponse, Result>()
        {

            @Override
            public Result apply(WSResponse wsResponse) throws Throwable {
                return null;
            }
        }));
    }
}
