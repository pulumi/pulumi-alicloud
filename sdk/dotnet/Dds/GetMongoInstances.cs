// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dds
{
    public static class GetMongoInstances
    {
        public static Task<GetMongoInstancesResult> InvokeAsync(GetMongoInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMongoInstancesResult>("alicloud:dds/getMongoInstances:getMongoInstances", args ?? new GetMongoInstancesArgs(), options.WithDefaults());

        public static Output<GetMongoInstancesResult> Invoke(GetMongoInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMongoInstancesResult>("alicloud:dds/getMongoInstances:getMongoInstances", args ?? new GetMongoInstancesInvokeArgs(), options.WithDefaults());

        public static Output<GetMongoInstancesResult> Invoke(GetMongoInstancesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMongoInstancesResult>("alicloud:dds/getMongoInstances:getMongoInstances", args ?? new GetMongoInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMongoInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("instanceClass")]
        public string? InstanceClass { get; set; }

        [Input("instanceType")]
        public string? InstanceType { get; set; }

        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetMongoInstancesArgs()
        {
        }
        public static new GetMongoInstancesArgs Empty => new GetMongoInstancesArgs();
    }

    public sealed class GetMongoInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetMongoInstancesInvokeArgs()
        {
        }
        public static new GetMongoInstancesInvokeArgs Empty => new GetMongoInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMongoInstancesResult
    {
        public readonly string? AvailabilityZone;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceClass;
        public readonly string? InstanceType;
        public readonly ImmutableArray<Outputs.GetMongoInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetMongoInstancesResult(
            string? availabilityZone,

            string id,

            ImmutableArray<string> ids,

            string? instanceClass,

            string? instanceType,

            ImmutableArray<Outputs.GetMongoInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableDictionary<string, string>? tags)
        {
            AvailabilityZone = availabilityZone;
            Id = id;
            Ids = ids;
            InstanceClass = instanceClass;
            InstanceType = instanceType;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Tags = tags;
        }
    }
}
