// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var zone = new AliCloud.Pvtz.Zone("zone", new()
    ///     {
    ///         ZoneName = "foo.test.com",
    ///     });
    /// 
    ///     var foo = new AliCloud.Pvtz.ZoneRecord("foo", new()
    ///     {
    ///         ZoneId = zone.Id,
    ///         Rr = "www",
    ///         Type = "CNAME",
    ///         Value = "bbb.test.com",
    ///         Ttl = 60,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Private Zone Record can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:pvtz/zoneRecord:ZoneRecord example abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pvtz/zoneRecord:ZoneRecord")]
    public partial class ZoneRecord : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User language.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The Private Zone Record ID.
        /// </summary>
        [Output("recordId")]
        public Output<string> RecordId { get; private set; } = null!;

        /// <summary>
        /// The remark of the Private Zone Record.
        /// </summary>
        [Output("remark")]
        public Output<string?> Remark { get; private set; } = null!;

        /// <summary>
        /// The resource record of the Private Zone Record.
        /// </summary>
        [Output("resourceRecord")]
        public Output<string> ResourceRecord { get; private set; } = null!;

        /// <summary>
        /// The rr of the Private Zone Record.
        /// </summary>
        [Output("rr")]
        public Output<string> Rr { get; private set; } = null!;

        /// <summary>
        /// Resolve record status. Value:
        /// - ENABLE: enable resolution.
        /// - DISABLE: pause parsing.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// The ttl of the Private Zone Record. Default to `60`.
        /// </summary>
        [Output("ttl")]
        public Output<int?> Ttl { get; private set; } = null!;

        /// <summary>
        /// The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("userClientIp")]
        public Output<string?> UserClientIp { get; private set; } = null!;

        /// <summary>
        /// The value of the Private Zone Record.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;

        /// <summary>
        /// The name of the Private Zone Record.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZoneRecord resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZoneRecord(string name, ZoneRecordArgs args, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/zoneRecord:ZoneRecord", name, args ?? new ZoneRecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZoneRecord(string name, Input<string> id, ZoneRecordState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/zoneRecord:ZoneRecord", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ZoneRecord resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZoneRecord Get(string name, Input<string> id, ZoneRecordState? state = null, CustomResourceOptions? options = null)
        {
            return new ZoneRecord(name, id, state, options);
        }
    }

    public sealed class ZoneRecordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The remark of the Private Zone Record.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The resource record of the Private Zone Record.
        /// </summary>
        [Input("resourceRecord")]
        public Input<string>? ResourceRecord { get; set; }

        /// <summary>
        /// The rr of the Private Zone Record.
        /// </summary>
        [Input("rr")]
        public Input<string>? Rr { get; set; }

        /// <summary>
        /// Resolve record status. Value:
        /// - ENABLE: enable resolution.
        /// - DISABLE: pause parsing.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ttl of the Private Zone Record. Default to `60`.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        /// <summary>
        /// The value of the Private Zone Record.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        /// <summary>
        /// The name of the Private Zone Record.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ZoneRecordArgs()
        {
        }
        public static new ZoneRecordArgs Empty => new ZoneRecordArgs();
    }

    public sealed class ZoneRecordState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The Private Zone Record ID.
        /// </summary>
        [Input("recordId")]
        public Input<string>? RecordId { get; set; }

        /// <summary>
        /// The remark of the Private Zone Record.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The resource record of the Private Zone Record.
        /// </summary>
        [Input("resourceRecord")]
        public Input<string>? ResourceRecord { get; set; }

        /// <summary>
        /// The rr of the Private Zone Record.
        /// </summary>
        [Input("rr")]
        public Input<string>? Rr { get; set; }

        /// <summary>
        /// Resolve record status. Value:
        /// - ENABLE: enable resolution.
        /// - DISABLE: pause parsing.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ttl of the Private Zone Record. Default to `60`.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        /// <summary>
        /// The value of the Private Zone Record.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The name of the Private Zone Record.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZoneRecordState()
        {
        }
        public static new ZoneRecordState Empty => new ZoneRecordState();
    }
}
