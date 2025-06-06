// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    /// <summary>
    /// Provides a FCV3 Vpc Binding resource.
    /// 
    /// For information about FCV3 Vpc Binding and how to use it, see [What is Vpc Binding](https://www.alibabacloud.com/help/en/functioncompute/fc-3-0/developer-reference/api-fc-2023-03-30-createvpcbinding).
    /// 
    /// &gt; **NOTE:** Available since v1.230.0.
    /// 
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var vpc = new AliCloud.Vpc.Network("vpc", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/8",
    ///         VpcName = name,
    ///     });
    /// 
    ///     var function = new AliCloud.FC.V3Function("function", new()
    ///     {
    ///         MemorySize = 512,
    ///         Cpu = 0.5,
    ///         Handler = "index.Handler",
    ///         Code = new AliCloud.FC.Inputs.V3FunctionCodeArgs
    ///         {
    ///             ZipFile = "UEsDBBQACAAIAAAAAAAAAAAAAAAAAAAAAAAIAAAAaW5kZXgucHmEkEFKxEAQRfd9ig9ZTCJOooIwDMwNXLqXnnQlaalUhU5lRj2KZ/FOXkESGR114bJ/P/7jV4b1xRq1hijtFpM1682cuNgPmgysbRulPT0fRxXnMtwrSPyeCdYRokSLnuMLJTTkbUqEvDMbxm1VdcRD6Tk+T1LW2ldB66knsYdA5iNX17ebm6tN2VnPhcswMPmREPuBacb+CiapLarAj9gT6/H97dVlCNScY3mtYvRkxdZlwDKDEnanPWVLdrdkeXEGlFEazVdfPVHaVeHc3N15CUwppwOJXeK7HshAB8NuOU7J6sP4SRXuH/EvbUfMiqMmDqv5M5FNSfAj/wgAAP//UEsHCPl//NYAAQAArwEAAFBLAQIUABQACAAIAAAAAAD5f/zWAAEAAK8BAAAIAAAAAAAAAAAAAAAAAAAAAABpbmRleC5weVBLBQYAAAAAAQABADYAAAA2AQAAAAA=",
    ///         },
    ///         FunctionName = name,
    ///         Runtime = "python3.9",
    ///         DiskSize = 512,
    ///         LogConfig = new AliCloud.FC.Inputs.V3FunctionLogConfigArgs
    ///         {
    ///             LogBeginRule = "None",
    ///         },
    ///     });
    /// 
    ///     var @default = new AliCloud.FC.V3VpcBinding("default", new()
    ///     {
    ///         FunctionName = function.FunctionName,
    ///         VpcId = vpc.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// FCV3 Vpc Binding can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:fc/v3VpcBinding:V3VpcBinding example &lt;function_name&gt;:&lt;vpc_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:fc/v3VpcBinding:V3VpcBinding")]
    public partial class V3VpcBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Function Name
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// VPC instance ID
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a V3VpcBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V3VpcBinding(string name, V3VpcBindingArgs args, CustomResourceOptions? options = null)
            : base("alicloud:fc/v3VpcBinding:V3VpcBinding", name, args ?? new V3VpcBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V3VpcBinding(string name, Input<string> id, V3VpcBindingState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/v3VpcBinding:V3VpcBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing V3VpcBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V3VpcBinding Get(string name, Input<string> id, V3VpcBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new V3VpcBinding(name, id, state, options);
        }
    }

    public sealed class V3VpcBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Function Name
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// VPC instance ID
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public V3VpcBindingArgs()
        {
        }
        public static new V3VpcBindingArgs Empty => new V3VpcBindingArgs();
    }

    public sealed class V3VpcBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Function Name
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// VPC instance ID
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public V3VpcBindingState()
        {
        }
        public static new V3VpcBindingState Empty => new V3VpcBindingState();
    }
}
