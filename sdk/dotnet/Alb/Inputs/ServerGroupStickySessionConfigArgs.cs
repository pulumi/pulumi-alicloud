// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ServerGroupStickySessionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cookie to be configured on the server.
        /// 
        /// The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).
        /// 
        /// &gt; **NOTE:**  This parameter takes effect when the `StickySessionEnabled` parameter is set to `true` and the `StickySessionType` parameter is set to `Server`.
        /// </summary>
        [Input("cookie")]
        public Input<string>? Cookie { get; set; }

        /// <summary>
        /// The maximum amount of time to wait before the session cookie expires. Unit: seconds.
        /// 
        /// Valid values: `1` to `86400`.
        /// 
        /// Default value: `1000`.
        /// 
        /// &gt; **NOTE:**   This parameter takes effect only when `StickySessionEnabled` is set to `true` and `StickySessionType` is set to `Insert`.
        /// </summary>
        [Input("cookieTimeout")]
        public Input<int>? CookieTimeout { get; set; }

        /// <summary>
        /// Specifies whether to enable session persistence. Valid values:
        /// </summary>
        [Input("stickySessionEnabled")]
        public Input<bool>? StickySessionEnabled { get; set; }

        /// <summary>
        /// The method that is used to handle a cookie. Valid values:
        /// 
        /// *   `Insert`: inserts a cookie.
        /// 
        /// ALB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client contains this cookie and the listener forwards this request to the recorded backend server.
        /// 
        /// *   `Server`: rewrites a cookie.
        /// 
        /// When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.
        /// 
        /// &gt; **NOTE:**  This parameter takes effect when the `StickySessionEnabled` parameter is set to `true` for the server group.
        /// </summary>
        [Input("stickySessionType")]
        public Input<string>? StickySessionType { get; set; }

        public ServerGroupStickySessionConfigArgs()
        {
        }
        public static new ServerGroupStickySessionConfigArgs Empty => new ServerGroupStickySessionConfigArgs();
    }
}
