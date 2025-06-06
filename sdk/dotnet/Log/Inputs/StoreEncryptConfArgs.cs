// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Inputs
{

    public sealed class StoreEncryptConfArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable encryption. Default false.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Supported encryption type, only supports `default`(AES), `m4`.
        /// </summary>
        [Input("encryptType")]
        public Input<string>? EncryptType { get; set; }

        /// <summary>
        /// User bring your own key (BYOK) encryption Refer to details, the format is as follows. See user_cmk_info below. `{ "cmk_key_id": "your_cmk_key_id", "arn": "your_role_arn", "region_id": "you_cmk_region_id" }`. See `user_cmk_info` below.
        /// </summary>
        [Input("userCmkInfo")]
        public Input<Inputs.StoreEncryptConfUserCmkInfoArgs>? UserCmkInfo { get; set; }

        public StoreEncryptConfArgs()
        {
        }
        public static new StoreEncryptConfArgs Empty => new StoreEncryptConfArgs();
    }
}
