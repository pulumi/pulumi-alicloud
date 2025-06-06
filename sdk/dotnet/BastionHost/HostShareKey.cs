// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost
{
    /// <summary>
    /// Provides a Bastion Host Share Key resource.
    /// 
    /// For information about Bastion Host Host Share Key and how to use it, see [What is Host Share Key](https://www.alibabacloud.com/help/en/bastion-host/latest/createhostsharekey).
    /// 
    /// &gt; **NOTE:** Available since v1.165.0.
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
    ///     var name = config.Get("name") ?? "tf_example";
    ///     var @default = AliCloud.BastionHost.GetInstances.Invoke();
    /// 
    ///     var defaultGetZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
    ///     {
    ///         NameRegex = "^default-NODELETING$",
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultGetSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
    ///     {
    ///         CidrBlock = "10.4.0.0/24",
    ///         VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         ZoneId = defaultGetZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new List&lt;AliCloud.Ecs.SecurityGroup&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; @default.Apply(@default =&gt; @default.Apply(getInstancesResult =&gt; getInstancesResult.Ids)).Length.Apply(length =&gt; length &gt; 0 ? 0 : 1); rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         defaultSecurityGroup.Add(new AliCloud.Ecs.SecurityGroup($"default-{range.Value}", new()
    ///         {
    ///             VpcId = defaultGetNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         }));
    ///     }
    ///     var defaultInstance = new List&lt;AliCloud.BastionHost.Instance&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; @default.Apply(@default =&gt; @default.Apply(getInstancesResult =&gt; getInstancesResult.Ids)).Length.Apply(length =&gt; length &gt; 0 ? 0 : 1); rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         defaultInstance.Add(new AliCloud.BastionHost.Instance($"default-{range.Value}", new()
    ///         {
    ///             Description = name,
    ///             LicenseCode = "bhah_ent_50_asset",
    ///             PlanCode = "cloudbastion",
    ///             Storage = "5",
    ///             Bandwidth = "5",
    ///             Period = 1,
    ///             VswitchId = defaultGetSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
    ///             SecurityGroupIds = new[]
    ///             {
    ///                 defaultSecurityGroup[0].Id,
    ///             },
    ///         }));
    ///     }
    ///     var instanceId = Output.Tuple(@default.Apply(@default =&gt; @default.Apply(getInstancesResult =&gt; getInstancesResult.Ids)).Length, @default, defaultInstance[0].Id).Apply(values =&gt;
    ///     {
    ///         var length = values.Item1;
    ///         var @default = values.Item2;
    ///         var id = values.Item3;
    ///         return length &gt; 0 ? @default.Apply(getInstancesResult =&gt; getInstancesResult.Ids[0]) : id;
    ///     });
    /// 
    ///     var privateKey = config.Get("privateKey") ?? "LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlFcEFJQkFBS0NBUUVBc25oc29SSVVwVXltSG1FVHJXUGxDbkhMa3c3N0JYTm44ZHcvbDg3eG10SUhjd2syCkRybjFDZk5jZkpJV0tSdkFaYkdKMlZTS1RiRDhPTmcyT3JvUHFGUHBLOHJ5QjJRb1NYQVRsaUVHWFhNeW1tRm8KeDBmem12THFscUxpNGZnOExhcTc5UC85aGxLU1djTWhJU0pYVTNHMS9KdEFBUmEyQXc4cXEzSVQvMkZ5NktrdwowMU9MdDdLN2pGUFRPaHhtdmNoSkZ1SVo1YXI0cW5HUlFHQnpCL2hoRHVIWEMwRlhJZ2ozd0NXMDZ4R2V2WjJyCmNCWWwwN1luL2lvZk95MU0wRjZZN0JrMU95N21vYndzM1JsalUyL2FpZlhLMmNOUlk2Qjl5WXNvd1RBZmQ5OTQKQ2YxSlF3TlhsaUZCeTZueEJLQk1YbDhIU1grS1o3L29PUlIwVXdJREFRQUJBb0lCQVFDbU5JSXR5ckhSY3oxdApJMGo0L0FQc295ZE1EL0owRkJMa2FoSUxKWjFaYW1tbmx4ZHh4WHBQUndXRnVXTEw2OTFVbDI5aUoxb1ptazU1Ci9ka2EvZlhnOUN3OUxXWVN2aExLdVlaMEZOTmhxZ3VoUEVBZy9uLytlR1ZCM2ZYZkxaZVZpK0E0L1VHMG15ZFMKVXVlQ2ZRSElZeWh4VkgvWnc3WER5WmNhVFVZVVdMUWlYcVN0Y2JRbnZFOXpwOGc5TWh5UkhBcWYwbEt2UTRqdwphUnNKTnlob3lhZWcvUXlFeHVYNGdBR1lIc1lTSDRFVmtXOHl5WE1aOHpRdk1OSUNiYXhmUkRuSngybUh6a09rCnFHczVXbFp5L3VrQk5jWTQwd2Y0eTY2bEVJaVpKbiswaFhtSTF4Tk5SdHRwMjZnY3ROOXZWbmVicTdLTnpjTDgKeFQrMXZJaEpBb0dCQU9iMVM1YlE4NVRFWDBoZTRmdXc2R3ExbnhRLzJUSU03emZhK2VhZThPQlh2eVNFV3JpdwpPZzM3RFhVUDFNVU1iTEJRenE0STl1dE5YSVZadEFLR0h6ZDR6WmtQeGxORjZPN0FyWnJEWElDNEdKZHdmSEhxCjJZcDkxUDlWekJlOVhkTVdZVGFCNkMzWVdtYzQwM08vYWdyRCtNb2JnL0hqMSt0d2xZR2hjdlV2QW9HQkFNWFMKT2VnWHc5VUF3VEZabFBtZzZKeDI3TzNXUFBHd1E3QzRnYitFZzZkR1pLRnJVR1ZId2VUUG1HaGtwN1BmYU5ESwplaFVoUWFnNm9XOTF4dkE2YldZZ29SQmczUWkxc01MblRWeTExeVN1UEVFSCtMT2s1N3d2akNLSk5XZnM0SjVyCmg1NGw0QXZ6UVhyWWN0UlZkSmYrNjFacGFnTkdZMVBvWVJMTHJMSWRBb0dBTndydzErRzJtNWJ0YW04S2hwU1QKMzVLbmRnajlkM3N6cStrcE03aGZpZWYvcXZGTU9jWHVJQlRjRVRFVHNWNlRyTFdsZkQ2d3NrVitybDFCbEhSbwpqaXpoT3dCU2NOZ3hlbTA3TXE0cXBwYTViYVltVW5QNUlwTjRwdDNJeFVPaFQ4UitxS0h2TnJYZ1hjZGlSYXl4CjFoejhkeFoxckxselpTNHd3M001MVlzQ2dZRUFpUDEwTEUySXg5Q2wrTTdZWTZZU2I0Zkx1MGhKRy9XOGFuemIKSFExZlBrOTVFRytJVlJyRUl2ZS95MHNvOTE4VzdyL0lteWxVbG5ORHFEUWZkK3grSmVNaXBuenRsRUorRGZxdgprQ3c4dUtJUUI5akZXV0l4T0JpVktyVnB6bll6ZG9Gd2dRd3BneDBKazFDZzlIblpMQWpVWUJyUDEwUy9ORFFRClJUdldjK0VDZ1lBeGRIZWxQNG1RdkJaS1oxMlNKbHlLbFVLeW43aHhzSHVkMkphMVNtS3FWeHBERDNlR0w0Y3QKZXA1QTZ5NkF4eGViZkI0aDdYNEZ0QTBBRURPdkZDR0J1QlRvZ3ZBdUNDVUtqK2JIUG1SNG53UVYzcWZ2M3loRAp0TGkwU2FHVElta2wvbUNCUDhZaW9JUys2N0xjby9kbHphUTNGVDlxTnJieFdFWjJlaS9LVlE9PQotLS0tLUVORCBSU0EgUFJJVkFURSBLRVktLS0tLQ==";
    ///     var defaultHostShareKey = new AliCloud.BastionHost.HostShareKey("default", new()
    ///     {
    ///         HostShareKeyName = name,
    ///         InstanceId = instanceId,
    ///         PrivateKey = privateKey,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Bastion Host Share Key can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:bastionhost/hostShareKey:HostShareKey example &lt;instance_id&gt;:&lt;host_share_key_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:bastionhost/hostShareKey:HostShareKey")]
    public partial class HostShareKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Output("hostShareKeyId")]
        public Output<string> HostShareKeyId { get; private set; } = null!;

        /// <summary>
        /// The name of the host shared key to be added. The name can be a maximum of 128 characters in length.
        /// </summary>
        [Output("hostShareKeyName")]
        public Output<string> HostShareKeyName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Bastion instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The password of the private key. The value is a Base64-encoded string.
        /// </summary>
        [Output("passPhrase")]
        public Output<string?> PassPhrase { get; private set; } = null!;

        /// <summary>
        /// The private key. The value is a Base64-encoded string.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The fingerprint of the private key.
        /// </summary>
        [Output("privateKeyFingerPrint")]
        public Output<string> PrivateKeyFingerPrint { get; private set; } = null!;


        /// <summary>
        /// Create a HostShareKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostShareKey(string name, HostShareKeyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/hostShareKey:HostShareKey", name, args ?? new HostShareKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostShareKey(string name, Input<string> id, HostShareKeyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:bastionhost/hostShareKey:HostShareKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "passPhrase",
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing HostShareKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostShareKey Get(string name, Input<string> id, HostShareKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new HostShareKey(name, id, state, options);
        }
    }

    public sealed class HostShareKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the host shared key to be added. The name can be a maximum of 128 characters in length.
        /// </summary>
        [Input("hostShareKeyName", required: true)]
        public Input<string> HostShareKeyName { get; set; } = null!;

        /// <summary>
        /// The ID of the Bastion instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("passPhrase")]
        private Input<string>? _passPhrase;

        /// <summary>
        /// The password of the private key. The value is a Base64-encoded string.
        /// </summary>
        public Input<string>? PassPhrase
        {
            get => _passPhrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _passPhrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key. The value is a Base64-encoded string.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public HostShareKeyArgs()
        {
        }
        public static new HostShareKeyArgs Empty => new HostShareKeyArgs();
    }

    public sealed class HostShareKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Input("hostShareKeyId")]
        public Input<string>? HostShareKeyId { get; set; }

        /// <summary>
        /// The name of the host shared key to be added. The name can be a maximum of 128 characters in length.
        /// </summary>
        [Input("hostShareKeyName")]
        public Input<string>? HostShareKeyName { get; set; }

        /// <summary>
        /// The ID of the Bastion instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        [Input("passPhrase")]
        private Input<string>? _passPhrase;

        /// <summary>
        /// The password of the private key. The value is a Base64-encoded string.
        /// </summary>
        public Input<string>? PassPhrase
        {
            get => _passPhrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _passPhrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key. The value is a Base64-encoded string.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The fingerprint of the private key.
        /// </summary>
        [Input("privateKeyFingerPrint")]
        public Input<string>? PrivateKeyFingerPrint { get; set; }

        public HostShareKeyState()
        {
        }
        public static new HostShareKeyState Empty => new HostShareKeyState();
    }
}
