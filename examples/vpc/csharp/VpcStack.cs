using Pulumi;
using AliCloud = Pulumi.AliCloud;

class VpcStack : Stack
{
    public VpcStack()
    {
        var vpc = new AliCloud.Vpc.Network("my-csharp-vpc", new AliCloud.Vpc.NetworkArgs
        {
            CidrBlock = "10.0.0.0/16",
        });
    }
}
