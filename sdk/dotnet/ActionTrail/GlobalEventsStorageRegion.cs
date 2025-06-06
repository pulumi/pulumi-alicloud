// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    /// <summary>
    /// Provides a Global events storage region resource.
    /// 
    /// For information about global events storage region and how to use it, see [What is Global Events Storage Region](https://next.api.alibabacloud.com/api/Actiontrail/2020-07-06/UpdateGlobalEventsStorageRegion).
    /// 
    /// &gt; **NOTE:** Available since v1.201.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new AliCloud.ActionTrail.GlobalEventsStorageRegion("foo", new()
    ///     {
    ///         StorageRegion = "cn-hangzhou",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global events storage region not can be imported.
    /// </summary>
    [AliCloudResourceType("alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion")]
    public partial class GlobalEventsStorageRegion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Global Events Storage Region.
        /// </summary>
        [Output("storageRegion")]
        public Output<string> StorageRegion { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalEventsStorageRegion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalEventsStorageRegion(string name, GlobalEventsStorageRegionArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion", name, args ?? new GlobalEventsStorageRegionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalEventsStorageRegion(string name, Input<string> id, GlobalEventsStorageRegionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:actiontrail/globalEventsStorageRegion:GlobalEventsStorageRegion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GlobalEventsStorageRegion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalEventsStorageRegion Get(string name, Input<string> id, GlobalEventsStorageRegionState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalEventsStorageRegion(name, id, state, options);
        }
    }

    public sealed class GlobalEventsStorageRegionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Global Events Storage Region.
        /// </summary>
        [Input("storageRegion")]
        public Input<string>? StorageRegion { get; set; }

        public GlobalEventsStorageRegionArgs()
        {
        }
        public static new GlobalEventsStorageRegionArgs Empty => new GlobalEventsStorageRegionArgs();
    }

    public sealed class GlobalEventsStorageRegionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Global Events Storage Region.
        /// </summary>
        [Input("storageRegion")]
        public Input<string>? StorageRegion { get; set; }

        public GlobalEventsStorageRegionState()
        {
        }
        public static new GlobalEventsStorageRegionState Empty => new GlobalEventsStorageRegionState();
    }
}
