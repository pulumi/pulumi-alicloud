// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Inputs
{

    public sealed class AddressPoolAddressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address that you want to add to the address pool.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The source region of the address. expressed as a JSON string. The structure is as follows:
        /// * `LineCodes`: List of home lineCodes.
        /// * `lineCodeRectifyType`: The rectification type of the line code. Default value: `AUTO`. Valid values: `NO_NEED`: no need for rectification. `RECTIFIED`: rectified. `AUTO`: automatic rectification.
        /// </summary>
        [Input("attributeInfo", required: true)]
        public Input<string> AttributeInfo { get; set; } = null!;

        /// <summary>
        /// The weight of the address. **NOTE:** The attribute is valid when the attribute `lba_strategy` is `RATIO`.
        /// </summary>
        [Input("lbaWeight")]
        public Input<int>? LbaWeight { get; set; }

        /// <summary>
        /// The type of the address. Valid values:`SMART`, `ONLINE` and `OFFLINE`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The description of the address.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        public AddressPoolAddressGetArgs()
        {
        }
        public static new AddressPoolAddressGetArgs Empty => new AddressPoolAddressGetArgs();
    }
}