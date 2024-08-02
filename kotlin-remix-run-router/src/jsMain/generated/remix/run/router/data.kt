// Generated by Karakum - do not modify it manually!

@file:JsModule("@remix-run/router")

package remix.run.router

import web.http.ResponseInit

/**
 * Create "responses" that contain `status`/`headers` without forcing
 * serialization into an actual `Response` - used by Remix single fetch
 */
external fun <D> data(data: D): DataWithResponseInit<D>

/**
 * Create "responses" that contain `status`/`headers` without forcing
 * serialization into an actual `Response` - used by Remix single fetch
 */
external fun <D> data(data: D, init: Double = definedExternally): DataWithResponseInit<D>

/**
 * Create "responses" that contain `status`/`headers` without forcing
 * serialization into an actual `Response` - used by Remix single fetch
 */
external fun <D> data(data: D, init: ResponseInit = definedExternally): DataWithResponseInit<D>
