// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecp
{
    public static class GetInstances
    {
        /// <summary>
        /// This data source provides the Ecp Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.158.0+.
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
        ///     var @default = AliCloud.Ecp.GetZones.Invoke();
        /// 
        ///     var defaultGetInstanceTypes = AliCloud.Ecp.GetInstanceTypes.Invoke();
        /// 
        ///     var countSize = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones)).Length;
        /// 
        ///     var zoneId = Output.Tuple(@default, countSize).Apply(values =&gt;
        ///     {
        ///         var @default = values.Item1;
        ///         var countSize = values.Item2;
        ///         return @default.Apply(getZonesResult =&gt; getZonesResult.Zones)[countSize - 1].ZoneId;
        ///     });
        /// 
        ///     var instanceTypeCountSize = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes).Length;
        /// 
        ///     var instanceType = Output.Tuple(defaultGetInstanceTypes, instanceTypeCountSize).Apply(values =&gt;
        ///     {
        ///         var defaultGetInstanceTypes = values.Item1;
        ///         var instanceTypeCountSize = values.Item2;
        ///         return defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes)[instanceTypeCountSize - 1].InstanceType;
        ///     });
        /// 
        ///     var defaultGetNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
        ///     {
        ///         NameRegex = "default-NODELETING",
        ///     });
        /// 
        ///     var defaultGetSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
        ///     {
        ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
        ///         ZoneId = zoneId,
        ///     });
        /// 
        ///     var @group = new AliCloud.Ecs.SecurityGroup("group", new()
        ///     {
        ///         Name = name,
        ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
        ///     });
        /// 
        ///     var defaultKeyPair = new AliCloud.Ecp.KeyPair("default", new()
        ///     {
        ///         KeyPairName = name,
        ///         PublicKeyBody = "ssh-rsa AAAAB3Nza12345678qwertyuudsfsg",
        ///     });
        /// 
        ///     var defaultInstance = new AliCloud.Ecp.Instance("default", new()
        ///     {
        ///         InstanceName = name,
        ///         Description = name,
        ///         Force = true,
        ///         KeyPairName = defaultKeyPair.KeyPairName,
        ///         VswitchId = defaultGetSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
        ///         ImageId = "android_9_0_0_release_2851157_20211201.vhd",
        ///         InstanceType = Output.Tuple(defaultGetInstanceTypes, instanceTypeCountSize).Apply(values =&gt;
        ///         {
        ///             var defaultGetInstanceTypes = values.Item1;
        ///             var instanceTypeCountSize = values.Item2;
        ///             return defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes)[instanceTypeCountSize - 1].InstanceType;
        ///         }),
        ///         PaymentType = "PayAsYouGo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstancesResult> InvokeAsync(GetInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstancesResult>("alicloud:ecp/getInstances:getInstances", args ?? new GetInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecp Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.158.0+.
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
        ///     var @default = AliCloud.Ecp.GetZones.Invoke();
        /// 
        ///     var defaultGetInstanceTypes = AliCloud.Ecp.GetInstanceTypes.Invoke();
        /// 
        ///     var countSize = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones)).Length;
        /// 
        ///     var zoneId = Output.Tuple(@default, countSize).Apply(values =&gt;
        ///     {
        ///         var @default = values.Item1;
        ///         var countSize = values.Item2;
        ///         return @default.Apply(getZonesResult =&gt; getZonesResult.Zones)[countSize - 1].ZoneId;
        ///     });
        /// 
        ///     var instanceTypeCountSize = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes).Length;
        /// 
        ///     var instanceType = Output.Tuple(defaultGetInstanceTypes, instanceTypeCountSize).Apply(values =&gt;
        ///     {
        ///         var defaultGetInstanceTypes = values.Item1;
        ///         var instanceTypeCountSize = values.Item2;
        ///         return defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes)[instanceTypeCountSize - 1].InstanceType;
        ///     });
        /// 
        ///     var defaultGetNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
        ///     {
        ///         NameRegex = "default-NODELETING",
        ///     });
        /// 
        ///     var defaultGetSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
        ///     {
        ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
        ///         ZoneId = zoneId,
        ///     });
        /// 
        ///     var @group = new AliCloud.Ecs.SecurityGroup("group", new()
        ///     {
        ///         Name = name,
        ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
        ///     });
        /// 
        ///     var defaultKeyPair = new AliCloud.Ecp.KeyPair("default", new()
        ///     {
        ///         KeyPairName = name,
        ///         PublicKeyBody = "ssh-rsa AAAAB3Nza12345678qwertyuudsfsg",
        ///     });
        /// 
        ///     var defaultInstance = new AliCloud.Ecp.Instance("default", new()
        ///     {
        ///         InstanceName = name,
        ///         Description = name,
        ///         Force = true,
        ///         KeyPairName = defaultKeyPair.KeyPairName,
        ///         VswitchId = defaultGetSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
        ///         ImageId = "android_9_0_0_release_2851157_20211201.vhd",
        ///         InstanceType = Output.Tuple(defaultGetInstanceTypes, instanceTypeCountSize).Apply(values =&gt;
        ///         {
        ///             var defaultGetInstanceTypes = values.Item1;
        ///             var instanceTypeCountSize = values.Item2;
        ///             return defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes)[instanceTypeCountSize - 1].InstanceType;
        ///         }),
        ///         PaymentType = "PayAsYouGo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstancesResult> Invoke(GetInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstancesResult>("alicloud:ecp/getInstances:getInstances", args ?? new GetInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Ecp Instances IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID Of The Image.
        /// </summary>
        [Input("imageId")]
        public string? ImageId { get; set; }

        /// <summary>
        /// The name of the instance. It must be 2 to 128 characters in length and must start with an
        /// uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
        /// half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
        /// the instance.
        /// </summary>
        [Input("instanceName")]
        public string? InstanceName { get; set; }

        /// <summary>
        /// Instance Type.
        /// </summary>
        [Input("instanceType")]
        public string? InstanceType { get; set; }

        /// <summary>
        /// The name of the key pair of the mobile phone instance.
        /// </summary>
        [Input("keyPairName")]
        public string? KeyPairName { get; set; }

        /// <summary>
        /// A regex string to filter results by mobile phone name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The payment type.Valid values: `PayAsYouGo`,`Subscription`
        /// </summary>
        [Input("paymentType")]
        public string? PaymentType { get; set; }

        /// <summary>
        /// The selected resolution for the cloud mobile phone instance.
        /// </summary>
        [Input("resolution")]
        public string? Resolution { get; set; }

        /// <summary>
        /// Instance status. Valid values: `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`
        /// .
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetInstancesArgs()
        {
        }
        public static new GetInstancesArgs Empty => new GetInstancesArgs();
    }

    public sealed class GetInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Ecp Instances IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID Of The Image.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// The name of the instance. It must be 2 to 128 characters in length and must start with an
        /// uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
        /// half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
        /// the instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Instance Type.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The name of the key pair of the mobile phone instance.
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// A regex string to filter results by mobile phone name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The payment type.Valid values: `PayAsYouGo`,`Subscription`
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The selected resolution for the cloud mobile phone instance.
        /// </summary>
        [Input("resolution")]
        public Input<string>? Resolution { get; set; }

        /// <summary>
        /// Instance status. Valid values: `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`
        /// .
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetInstancesInvokeArgs()
        {
        }
        public static new GetInstancesInvokeArgs Empty => new GetInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstancesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? ImageId;
        public readonly string? InstanceName;
        public readonly string? InstanceType;
        public readonly ImmutableArray<Outputs.GetInstancesInstanceResult> Instances;
        public readonly string? KeyPairName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PaymentType;
        public readonly string? Resolution;
        public readonly string? Status;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetInstancesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? imageId,

            string? instanceName,

            string? instanceType,

            ImmutableArray<Outputs.GetInstancesInstanceResult> instances,

            string? keyPairName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? paymentType,

            string? resolution,

            string? status,

            string? zoneId)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            ImageId = imageId;
            InstanceName = instanceName;
            InstanceType = instanceType;
            Instances = instances;
            KeyPairName = keyPairName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PaymentType = paymentType;
            Resolution = resolution;
            Status = status;
            ZoneId = zoneId;
        }
    }
}